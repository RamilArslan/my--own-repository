package ShoesPairs;

public class Shoes {

    public int calc(String origin){
        int intervals = 0;
        int shoes=0;
        for (int i = 0; i <origin.length() ; i++) {
            switch (origin.charAt(i)){
                case 'L': shoes++;  ;break;
                case 'R': ;shoes--; break;


            }
            if (shoes == 0) intervals++;
        }
        return intervals;
    }
}
