var child_process = require('child_process');
var exec = child_process.exec;
var child = child_process.child;

// junit renamed to junit.jar
//hamcrest renamed to hamcrest.jar

var showErr = function(error){
    if(error.code == 'ENOENT'){
        var message = [error.path, ' Not found in the current directory'].join('');
        console.log('-->Error: '+message);
    }
}
var showOutput = function (error, stdout, stderr){
    console.log(stdout);
    if(stderr!= '')
        console.log('-->Error: '+stderr);
    if(error !== null)
        showErr(error);
}
var compile_and_run = function(){
    var arguements = process.argv.slice(2);
    var main = arguements[0] || 'Main.java';
    var Class = arguements[0].split('.')[0];
    var test = Class+'Test.java';
    var executable = Class+'Test';

    var compileMain = 'javac '+main;
    var complileTest = 'javac -cp .:junit.jar ' + test;
    var runTest = 'java -cp .:junit.jar:hamcrest.jar org.junit.runner.JUnitCore ' + executable;
    var command = compileMain+' && ' + complileTest + ' && ' + runTest;
    console.log('Executing the following command:');
    console.log(compileMain);
    console.log(complileTest);
    console.log(runTest);
    console.log('-----------------------------------------------------------------------------')

    child = exec(command, showOutput);
}
compile_and_run();
