package com.example.picrecstack;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProfileFragment extends Fragment {
    private String[] roles;
    private Integer[] points;
    private String[] arrayInList;
    private HashMap<String, Integer> rolesToPoints;
    private ListView listView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
            Bundle bundle = getArguments();
            if (bundle != null) {
                if (bundle.getSerializable("rolesToPoints") != null)
                    rolesToPoints = (HashMap<String, Integer>) bundle.getSerializable("rolesToPoints");
                //remove all entries which have a value == 0
                rolesToPoints.values().removeAll(Collections.singleton(0));
                HashMap<String, Integer> rolesToPointsSorted = sortByValue(rolesToPoints);
                roles = rolesToPointsSorted.keySet().toArray(new String[rolesToPointsSorted.size()]);
                roles = mapExplanationsToKeyName(roles);
                points = rolesToPointsSorted.values().toArray(new Integer[rolesToPointsSorted.size()]);
                arrayInList = modifyHashMapParts(roles, points);
                listView = (ListView) view.findViewById(R.id.list_preferences);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        arrayInList
                );
                listView.setAdapter(adapter);
                TextView descriptionPreferences = view.findViewById(R.id.preferences_description);
                descriptionPreferences.setText("");
                Button addModifyPreferences = view.findViewById(R.id.add_modify_preferences);
                addModifyPreferences.setText("Modify preferences");
            }
        return view;
    }

    public String[] modifyHashMapParts(String[] stringArray, Integer[] integerArray) {
        String[] modifiedArray = new String[stringArray.length];
        for (int i = 0; i<stringArray.length; i++) {
            modifiedArray[i] = stringArray[i];
        }
        return modifiedArray;
    }

    public String[] mapExplanationsToKeyName(String[] array) {
        for (int i = 0; i<array.length; i++) {
            switch (array[i]){
                case "active1": array[i] = "\uD83D\uDC4D"+" You enjoy staying active during your holidays.";
                    break;
                case "arch1": array[i] = "\uD83D\uDC4D"+" You are interested in exploring archeological sites.";
                    break;
                case "classy1": array[i] = "\uD83D\uDC4D"+" You like it classy - fine dinners, 5-star hotels are your thing.";
                    break;
                case "drifter1": array[i] = "\uD83D\uDC4D"+" You enjoy moving from one place to another leading a hippie lifestyle.";
                    break;
                case "drifter2": array[i] =  "\uD83D\uDC4D"+" You enjoy moving from one place to another leading a hippie lifestyle.";
                    break;
                case "classy2": array[i] = "\uD83D\uDC4D"+" You like it classy - fine dinners, 5-star hotels are your thing.";
                    break;
                case "educational1": array[i] = "\uD83D\uDC4D"+" You enjoy participating in seminars and planned study tours.";
                    break;
                case "escapist1": array[i] = "\uD83D\uDC4D"+" Stress is your enemy, you enjoy peacefulness and quietness";
                    break;
                case "arch2": array[i] = "\uD83D\uDC4D"+" You are interested in exploring archeological sites.";
                    break;
                case "sun1": array[i] = "\uD83D\uDC4D"+" There's nothing better than a warm vacation at the beach.";
                    break;
                case "sun2": array[i] = "\uD83D\uDC4D"+" There's nothing better than a warm vacation at the beach.";
                    break;
                default: array[i] = "\uD83D\uDC4D"+" You want to try from everything.";
                    break;
            }
        }
        return array;
    }

    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}
