public class String_Data{
    String data;

    public String_Data(String data){
        this.data = data;
    }

    private void print(String message){
        System.out.println(message);
    }

    public void countVowels(){
        int count = 0;
        String capital_case = this.data.toUpperCase();
        for(int index=0; index < capital_case.length(); index++){
            switch(capital_case.charAt(index)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': count++;
            }
        }
        print(this.data+" has "+count+" Vowels");
    }
}
