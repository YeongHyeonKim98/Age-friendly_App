package selfcheck.app;


import android.util.Log;



import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.BufferedInputStream;
import java.net.URL;
import java.util.ArrayList;

public class ShelterApi2 {
    private static  String ServicKey = "";


    public ShelterApi2(){
//        try{
//            apiParserSearch();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
    public ArrayList<MapPoint2> apiParserSearch2() throws Exception {
        URL url = new URL(getURLParam2(null));

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser xpp = factory.newPullParser();
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        xpp.setInput(bis, "utf-8");

        String tag = null;
        int event_type = xpp.getEventType();

        ArrayList<MapPoint2> mapPoint2 = new ArrayList<MapPoint2>();

        String  item2 = null ,dutyName2= null,  wgs84Lat2=null, wgs84Lon2=null;
        boolean bitem2 = false, bdutyName2 = false, bwgs84Lat2=false, bwgs84Lon2=false;

        while(event_type!=XmlPullParser.END_DOCUMENT){
            if(event_type == XmlPullParser.START_TAG){
                tag = xpp.getName();
                Log.d("kin", tag);
                if(tag.equals("dutyName")){
                    bdutyName2 = true;
                }
                if(tag.equals("wgs84Lat")){
                    bwgs84Lat2 = true;
                }
                if(tag.equals("wgs84Lon")){
                    bwgs84Lon2 = true;
                }
            }
            else if(event_type == XmlPullParser.TEXT){
                if(bdutyName2 == true){
                    dutyName2 = xpp.getText();
                    bdutyName2 = false;
                }
                else if(bwgs84Lat2 == true){
                    wgs84Lat2 = xpp.getText();
                    bwgs84Lat2 = false;
                }
                else if(bwgs84Lon2 == true){
                    wgs84Lon2 = xpp.getText();
                    bwgs84Lon2 = false;
                }
            }
            else if(event_type == XmlPullParser.END_TAG){
                tag = xpp.getName();
                if(tag.equals("item")){
                    MapPoint2 entity = new MapPoint2();
                    entity.setDutyName2(dutyName2);
                    entity.setWgs84Lat2(Double.valueOf(wgs84Lat2));
                    entity.setWgs84Lon2(Double.valueOf(wgs84Lon2));
                    mapPoint2.add(entity);
                    System.out.println(mapPoint2.size());
                }
            }
            event_type = xpp.next();
        }
        System.out.println(mapPoint2.size());
        return mapPoint2;
    }
    private String getURLParam2(String search){
        String url = "";
        return url;
    }
    public static void main(String[] args){
        new ShelterApi2();
    }
}
