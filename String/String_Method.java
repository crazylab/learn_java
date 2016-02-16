public class String_Method{
    public void print(String message){
        System.out.println(message);
    }

    public int countVowels(String data){
        int count = 0;
        String capital_case = data.toUpperCase();
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

    public int countConsonants(String data){
        return data.length() - countVowels(data);
    }
}
