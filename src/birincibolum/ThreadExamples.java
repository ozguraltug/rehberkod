package birincibolum;

public class ThreadExamples {
    public static void main(String[] args) {



        Thread th1=new Thread(){
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 100; i++) {

                        System.out.println(i + ".gün domatesin boyu " + i + " cm oldu.");

                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }
        };
Thread th2=new Thread(){
    @Override
    public void run() {
        try {
            for (int j = 1; j <= 100; j++) {

                System.out.println(j + ".gün salatalığın boyu " + j + " cm oldu.");

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
};
       th1.start();
       th2.start();

    }
}
