//loop fazendo a tabela os números binários
public class LoopFor {
    public static void main(String[] args){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++)
                for(int k = 0; k < 2; k++)
                    for(int l = 0; l < 2; l++)
                        System.out.println(i + " " + j + " " + k + " " + l);
        }
    }
}
