package selfcheck.app;


import android.util.Log;


import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.BufferedInputStream;
import java.net.URL;
import java.util.ArrayList;

public class ShelterApi3 {
    private static  String ServicKey = "";


    public ShelterApi3(){
//        try{
//            apiParserSearch();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
    public ArrayList<MapPoint3> apiParserSearch3() throws Exception {
        URL url = new URL(getURLParam3(null));

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser xpp = factory.newPullParser();
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        xpp.setInput(bis, "utf-8");

        String tag = null;
        int event_type = xpp.getEventType();

        ArrayList<MapPoint3> mapPoint3 = new ArrayList<MapPoint3>();

        String  item2 = null ,FACLT_NM3= null,  REFINE_WGS84_LAT3=null, REFINE_WGS84_LOGT3=null;
        boolean bitem2 = false, bFACLT_NM3 = false, bREFINE_WGS84_LAT3=false, bREFINE_WGS84_LOGT3=false;

        while(event_type!=XmlPullParser.END_DOCUMENT){
            if(event_type == XmlPullParser.START_TAG){
                tag = xpp.getName();
                Log.d("kin", tag);
                if(tag.equals("FACLT_NM3")){
                    bFACLT_NM3 = true;
                }
                if(tag.equals("REFINE_WGS84_LAT3")){
                    bREFINE_WGS84_LAT3 = true;
                }
                if(tag.equals("REFINE_WGS84_LOGT3")){
                    bREFINE_WGS84_LOGT3 = true;
                }
            }
            else if(event_type == XmlPullParser.TEXT){
                if(bFACLT_NM3 == true){
                    FACLT_NM3 = xpp.getText();
                    bFACLT_NM3 = false;
                }
                else if(bREFINE_WGS84_LAT3 == true){
                    REFINE_WGS84_LAT3 = xpp.getText();
                    bREFINE_WGS84_LAT3 = false;
                }
                else if(bREFINE_WGS84_LOGT3 == true){
                    REFINE_WGS84_LOGT3 = xpp.getText();
                    bREFINE_WGS84_LOGT3 = false;
                }
            }
            else if(event_type == XmlPullParser.END_TAG){
                tag = xpp.getName();
                if(tag.equals("row")){
                    MapPoint3 entity = new MapPoint3();
                    entity.setFACLT_NM3(FACLT_NM3);
                    entity.setREFINE_WGS84_LAT3(Double.valueOf(REFINE_WGS84_LAT3));
                    entity.setREFINE_WGS84_LOGT3(Double.valueOf(REFINE_WGS84_LOGT3));
                    mapPoint3.add(entity);
                    System.out.println(mapPoint3.size());
                }
            }
            event_type = xpp.next();
        }
        System.out.println(mapPoint3.size());
        return mapPoint3;
    }
    private String getURLParam3(String search){
        String url = "";
        return url;
    }
    public static void main(String[] args){
        new ShelterApi3();
    }
}
