var child_process = require('child_process');
var exec = child_process.exec;
var child = child_process.child;

// rename junit-4.xx.jar to junit.jar
//rename hamcrest-core.jar to hamcrest.jar

//run test command : node test.js MyClass.java
//test file name shoud be MyClassTest.java

//All file shoud be kept in same directory

var showErr = function(error){
    if(error.code == 'ENOENT'){
        var message = [error.path, ' Not found in the current directory'].join('');
        console.log('-->Error: '+message);
    }
}

var showOutput = function (error, stdout, stderr){
    stdout && console.log(stdout);
    if(stderr!= '')
        console.log('-->Error: '+stderr);
    if(error !== null)
        showErr(error);
}
var compile_and_run = function(){
    var arguements = process.argv.slice(2);

    var main = arguements[0] || 'Main.java';
    var Class = main.split('.')[0];
    var test = Class+'Test.java';
    var executable = Class+'Test';

    var compileMain = 'javac '+main;
    var compileTest = 'javac -cp .:junit.jar ' + test;
    var runTest = 'java -cp .:junit.jar:hamcrest.jar org.junit.runner.JUnitCore ' + executable;

    console.log('Executing the following command:');
    console.log(compileMain);
    child = exec(compileMain, showOutput);
    console.log(compileTest);
    exec(compileTest, showOutput);
    console.log(runTest);
    exec(runTest, showOutput);
    console.log('-----------------------------------------------------------------------------');

}
compile_and_run();
