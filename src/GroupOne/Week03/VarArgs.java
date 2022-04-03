package GroupOne.Week03;

class VarArgs {
    private void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private void test(boolean p, String ... args){
        boolean negate = !p;
        System.out.println("negate = " + negate);
        System.out.println("args.length = "+ args.length);
    }
}