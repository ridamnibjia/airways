public class Stock {
     private int icod, rcod, rq, qr, cscod, csq, qcs;
    public Stock(int fcod, int rcod, int rq,int qr, int cscod, int csq, int qcs)
    {
        this.icod = fcod;
        this.rcod = rcod;
        this.rq = rq;
        this.qr = qr;
        this.cscod = cscod;
        this.csq = csq;
        this.qcs = qcs;
    }
    public int geticod(){
        return icod;
    }
    public int getrcod(){
        return rcod;
    }
     public int getrq(){
        return rq;
    }
    public int getqr(){
        return qr;
    }
    public int getcscod(){
        return cscod;
    }
     public int getcsq(){
        return csq;
    }
      public int getqcs(){
        return qcs;
    }
}
