public class Room {
    private int no;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room (int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    public String toString(){
        return "["+no+","+type+","+(status?"空闲":"占用")+"]";
    }

    //测试程序
    /*public static void main(String[] args) {
        Room room = new Room(101,"单人间",false);
        System.out.println(room);
    }*/

    public boolean equals(Object obj){
    if(obj == null ||!(obj instanceof Room)) return false;
        if(this == obj) return true;
        Room room = (Room)obj;
        return this.getNo() == room.getNo();
    }

    /*测试程序
      public static void main(String[] args) {
        Room room = new Room(101,"单人间",false);
        System.out.println(room);
        Room room1 = new Room(101,"单人间",false);
        System.out.println(room.equals(room1));
    }
    */

}
