package edu.uw.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        Bundle bundle = this.getArguments();

        if (bundle != null) {
            TextView txtTitle = (TextView) rootView.findViewById(R.id.txtMovieTitle);
            txtTitle.setText(bundle.getString("title"));

            TextView txtImdb = (TextView) rootView.findViewById(R.id.txtMovieIMDB);
            txtImdb.setText("www.imdb.com/" + bundle.getString("imdb"));
        }

        return rootView;
    }

}
