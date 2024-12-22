public class LargeDigit {
    public static void main(String[] args) {
          for(int num=1000;num<=9999;num++) {
            if (num % 10 == 0 && num % 13 == 0) {
                System.out.println(num);
		break;
            }
        }
    }
}

