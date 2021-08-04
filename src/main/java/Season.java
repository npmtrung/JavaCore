public enum Season {
    SPRING("Xuân"),
    SUMMER("Hạ"),
    AUTUMN("Thu"),
    WINTER("Đong");

    String value;

    Season(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
