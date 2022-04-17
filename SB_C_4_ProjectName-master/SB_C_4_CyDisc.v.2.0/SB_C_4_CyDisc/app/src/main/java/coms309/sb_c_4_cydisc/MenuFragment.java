package coms309.sb_c_4_cydisc;


import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * @author Pierce Adajar
 * A fragment for creating and maintaining a menu.
 */
public class MenuFragment extends Fragment {
    MenuItem fav;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        fav = menu.add("add");
        fav.setIcon(null);
        super.onCreateOptionsMenu(menu, inflater);
    }
}