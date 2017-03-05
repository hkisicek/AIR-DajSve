package hr.foi.air.dajsve.Helpers;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Filip on 30.1.2017..
 */

public interface SearchLocationListener {

    ArrayList<String> onDataArrived(String strAddress, Context context, List<Double> allElementsLat, List<Double> allElementsLong, List<String> Id, int km);

}
