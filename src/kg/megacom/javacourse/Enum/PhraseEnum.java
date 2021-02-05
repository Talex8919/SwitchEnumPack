package kg.megacom.javacourse.Enum;

public enum PhraseEnum {
    DEVELOPINGPERF{
        @Override
        public void printPhrase() {
            System.out.println("I am trying  to  make server Work more  productively  ");
        }
    },
    LEARNINIGNEWMETHODS {
        @Override
        public void printPhrase() {
            System.out.println("I have  bought new book, now I am learning new way  of methods");
        }
    },
    UPDATINGPLATFORMS {
        @Override
        public void printPhrase() {
            System.out.println("The software should be updated immediately ");
        }
    },
    WORKINGON {
        @Override
        public  void printPhrase() {
            System.out.println("Trying to stimulate DEV team  to  work  productive");
        }
    };
    String phrase;

    boolean hasPhrase(){
        return phrase !=null;
    }
    PhraseEnum(String phrase) {
        this.phrase = phrase;
    }
    PhraseEnum(){

    }
    public abstract  void  printPhrase();
}




