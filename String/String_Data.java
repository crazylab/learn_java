public class String_Data{
    String data;

    public String_Data(String data){
        this.data = data;
    }

    public void print(String message){
        System.out.println(this.data + message);
    }

    public int countVowels(){
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
        return count;
    }

    public int countConsonants(){
        int count = this.data.length() - countVowels();
        return count;
    }
}
