package selfcheck.app;


import android.util.Log;



import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.BufferedInputStream;
import java.net.URL;
import java.util.ArrayList;

public class ShelterApi {
    private static  String ServicKey = "";
    public ShelterApi(){
//        try{
//            apiParserSearch();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
    public ArrayList<MapPoint> apiParserSearch() throws Exception {
        URL url = new URL(getURLParam(null));

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser xpp = factory.newPullParser();
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        xpp.setInput(bis, "utf-8");

        String tag = null;
        int event_type = xpp.getEventType();

        ArrayList<MapPoint> mapPoint = new ArrayList<MapPoint>();

        String  item = null ,dutyName= null,  wgs84Lat=null, wgs84Lon=null;
        boolean bitem = false, bdutyName = false, bwgs84Lat=false, bwgs84Lon=false;

        while(event_type!=XmlPullParser.END_DOCUMENT){
            if(event_type == XmlPullParser.START_TAG){
                tag = xpp.getName();
                Log.d("kin", tag);
                if(tag.equals("dutyName")){
                    bdutyName = true;
                }
                if(tag.equals("wgs84Lat")){
                    bwgs84Lat = true;
                }
                if(tag.equals("wgs84Lon")){
                    bwgs84Lon = true;
                }
            }
            else if(event_type == XmlPullParser.TEXT){
                if(bdutyName == true){
                    dutyName = xpp.getText();
                    bdutyName = false;
                }
                else if(bwgs84Lat == true){
                    wgs84Lat = xpp.getText();
                    bwgs84Lat = false;
                }
                else if(bwgs84Lon == true){
                    wgs84Lon = xpp.getText();
                    bwgs84Lon = false;
                }
            }
            else if(event_type == XmlPullParser.END_TAG){
                tag = xpp.getName();
                if(tag.equals("item")){
                    MapPoint entity = new MapPoint();
                    entity.setDutyName(dutyName);
                    entity.setWgs84Lat(Double.valueOf(wgs84Lat));
                    entity.setWgs84Lon(Double.valueOf(wgs84Lon));
                    mapPoint.add(entity);
                    System.out.println(mapPoint.size());
                }
            }
            event_type = xpp.next();
        }
        System.out.println(mapPoint.size());
        return mapPoint;
    }
    private String getURLParam(String search){
        String url = "";
        return url;
    }
    public static void main(String[] args){
        new ShelterApi();
    }
}
