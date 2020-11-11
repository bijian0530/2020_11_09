public class Hotel {
    private Room[][] rooms;
    public Hotel(){
        rooms = new Room[3][10];
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j <rooms[i].length; j++){
                if(i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }
                if(i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }
                if(i ==2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public void print(){
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }

    public void order(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo % 100- 1];
        room.setStatus(false);
        System.out.println(roomNo+"已经订房");
    }

    public void exit(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo % 100-1];
        room.setStatus(true);
        System.out.println(roomNo+"已经退房");
    }
}
