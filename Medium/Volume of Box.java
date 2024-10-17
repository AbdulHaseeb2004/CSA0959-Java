class Box {
    int length, width, height;

    // Default Constructor
    public Box() {
        this.length = 5;
        this.width = 5;
        this.height = 5;
    }

    public int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Volume of the box: " + box.volume());
    }
}
