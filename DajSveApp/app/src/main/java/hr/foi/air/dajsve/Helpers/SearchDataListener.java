package hr.foi.air.dajsve.Helpers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Filip on 30.1.2017..
 */

public interface SearchDataListener {

//    void onDataArrived(Object result, boolean ok);
    ArrayList<String> onDataArrived(String search, List<String> nazivPonude, List<String> hash, boolean ok);
}
