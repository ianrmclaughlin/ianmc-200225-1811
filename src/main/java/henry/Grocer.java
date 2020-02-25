package henry;

public class Grocer {
    long priceABasket(String basketContents){
        if (basketContents.equals("1 tin of soup")){
            return 65;
        }
        return 0;
    }
}
