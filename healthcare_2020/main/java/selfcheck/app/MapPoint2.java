package selfcheck.app;


public class MapPoint2 {
    private String dutyAddr2; // 약국 주소
    private String dutyInf2;
    private String dutyMapimg2;
    private String dutyName2; // 약국 이름
    private String dutyTel12; // 약국 전화번호
    private String dutyTime1c2;
    private String dutyTime1s2;
    private String dutyTime2c2;
    private String dutyTime2s2;
    private String dutyTime3c2;
    private String dutyTime3s2;
    private String dutyTime4c2;
    private String dutyTime4s2;
    private String dutyTime5c2;
    private String dutyTime5s2;
    private String dutyTime6c2;
    private String dutyTime6s2;
    private String hpid2;
    private String postCdn12;
    private String postCdn22;
    private String rnum2;
    private double wgs84Lat2; // 약국 위도
    private double wgs84Lon2; // 약국 경도


    public MapPoint2(){
        super();
    }
    public MapPoint2(String  dutyName2,  double wgs84Lat2, double wgs84Lon2){
        this.dutyName2 = dutyName2;
        this.dutyAddr2 = dutyAddr2;
        this.dutyTel12 = dutyTel12;
        this.wgs84Lat2  = wgs84Lat2;
        this.wgs84Lon2 = wgs84Lon2;
    }
    public String getDutyName2(){ // 약국 이름
        return dutyName2;
    }

    public void setDutyName2(String dutyName2){
        this.dutyName2 = dutyName2;
    }

    public double getWgs84Lat2(){ // 약국 위도
        return wgs84Lat2;
    }

    public void setWgs84Lat2(double wgs84Lat2){
        this.wgs84Lat2 = wgs84Lat2;
    }

    public double getWgs84Lon2(){ // 약국 경도
        return wgs84Lon2;
    }

    public void setWgs84Lon2(double wgs84Lon2){
        this.wgs84Lon2 = wgs84Lon2;
    }

}
