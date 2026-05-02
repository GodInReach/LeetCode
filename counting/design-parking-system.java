class ParkingSystem {
    int[] avail = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        avail[0]=big;
        avail[1]=medium;
        avail[2]=small;
    }
    
    public boolean addCar(int carType) {
        if(avail[carType-1]!=0){
            avail[carType-1]--;
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */