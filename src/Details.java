class Details {
    private int fcod,rcod,cscod,rmu,csu;
    public Details(int fcod, int rcod, int rmu,int cscod, int csu)
    {
        this.fcod = fcod;
        this.rcod = rcod;
         this.rmu = rmu;
        this.cscod = cscod;
        this.csu = csu;
    }
    public int getfcod(){
        return fcod;
    }
    public int getrcod(){
        return rcod;
    }
     public int getrmu(){
        return rmu;
    }
    public int getcscod(){
        return cscod;
    }
    public int getcsu(){
        return csu;
    }
}
