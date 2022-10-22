public class R136 {

        private R136(){
            System.out.println("This is Private Method");
        }
    R136(String name){
            System.out.println("This is Default Method");
        }
        protected R136(int pro){
            System.out.println("This is Protected Method");
        }
        public R136 (boolean isPub){
            System.out.println("This is Public Method");
        }

    public static void main(String[] args) {
        new R136();
        new R136( "print this");
        new R136( 136);
        new R136( true);
    }
    }

