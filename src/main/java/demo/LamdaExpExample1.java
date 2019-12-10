package demo;

import java.util.function.Supplier;

public class LamdaExpExample1 {
	

    class MasterClassAnonymous {

        Supplier<String> sa1 = new Supplier<String>() {
            @Override
            public String get() {
                System.out.println("this.toString() = " + this.toString());
                return this.toString();
            }
        };

        Supplier<String> sa2 = new Supplier<String>() {
            @Override
            public String get() {
                System.out.println("toString() = " + toString());
                return toString();
            }
        };

        public String toString() {
            return "I am a Master!";
        }
    }

    class MasterClassLambda {
        Supplier<String> sl1 = () -> this.toString();
        Supplier<String> sl2 = () -> toString();

        public String toString() {
            return "I am a Master!";
        }
    }

	
	
	public static void main(String[] args) {
		
		LamdaExpExample1.MasterClassLambda l  =new LamdaExpExample1().new MasterClassLambda();
		
	
		
	}

}
