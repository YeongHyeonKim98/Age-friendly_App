package selfcheck.app;


public class MapPoint3 {
    private String FACLT_NM3; //  이름
    private double REFINE_WGS84_LAT3; // 약국 위도
    private double REFINE_WGS84_LOGT3; // 약국 경도

    public MapPoint3(){
        super();
    }
    public MapPoint3(String  FACLT_NM3,  double REFINE_WGS84_LAT3, double wgs84Lon2){
        this.FACLT_NM3 = FACLT_NM3;
        this.REFINE_WGS84_LAT3  = REFINE_WGS84_LAT3;
        this.REFINE_WGS84_LOGT3 = REFINE_WGS84_LOGT3;
    }
    public String getFACLT_NM3(){ // 약국 이름
        return FACLT_NM3;
    }

    public void setFACLT_NM3(String REFINE_WGS84_LAT3){
        this.FACLT_NM3 = FACLT_NM3;
    }
    public double getREFINE_WGS84_LAT3(){ // 약국 이름
        return REFINE_WGS84_LAT3;
    }

    public void setREFINE_WGS84_LAT3(double REFINE_WGS84_LAT3){
        this.REFINE_WGS84_LAT3 = REFINE_WGS84_LAT3;
    }


    public double getREFINE_WGS84_LOGT3(){ // 약국 이름
        return REFINE_WGS84_LOGT3;
    }

    public void setREFINE_WGS84_LOGT3(double REFINE_WGS84_LOGT3){
        this.REFINE_WGS84_LOGT3 = REFINE_WGS84_LOGT3;
    }
}
