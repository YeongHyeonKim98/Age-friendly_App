package selfcheck.app;


public class MapPoint {
    private String dutyAddr; // 약국 주소
    private String dutyInf;
    private String dutyMapimg;
    private String dutyName; // 약국 이름
    private String dutyTel1; // 약국 전화번호
    private String dutyTime1c;
    private String dutyTime1s;
    private String dutyTime2c;
    private String dutyTime2s;
    private String dutyTime3c;
    private String dutyTime3s;
    private String dutyTime4c;
    private String dutyTime4s;
    private String dutyTime5c;
    private String dutyTime5s;
    private String dutyTime6c;
    private String dutyTime6s;
    private String hpid;
    private String postCdn1;
    private String postCdn2;
    private String rnum;
    private double wgs84Lat; // 약국 위도
    private double wgs84Lon; // 약국 경도


    public MapPoint(){
        super();
    }
    public MapPoint(String  dutyName,  double wgs84Lat, double wgs84Lon){
        this.dutyName = dutyName;
        this.dutyAddr = dutyAddr;
        this.dutyTel1 = dutyTel1;
        this.wgs84Lat  = wgs84Lat;
        this.wgs84Lon = wgs84Lon;
    }
    public String getDutyName(){ // 약국 이름
        return dutyName;
    }

    public void setDutyName(String dutyName){
        this.dutyName = dutyName;
    }

    public double getWgs84Lat(){ // 약국 위도
        return wgs84Lat;
    }

    public void setWgs84Lat(double wgs84Lat){
        this.wgs84Lat = wgs84Lat;
    }

    public double getWgs84Lon(){ // 약국 경도
        return wgs84Lon;
    }

    public void setWgs84Lon(double wgs84Lon){
        this.wgs84Lon = wgs84Lon;
    }

}

