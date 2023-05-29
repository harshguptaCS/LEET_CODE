class ParkingSystem {
    int b,m,s;
    public ParkingSystem(int big, int medium, int small) {
        b=big;
        m=medium;
        s=small;
    }
    public boolean addCar(int carType) {
        if(carType==1&&b>0) b--;
        else if(carType==2&&m>0) m--;
        else if(carType==3&&s>0) s--;
        else return false;
        return true;
    }
}
