package appewtc.masterung.fragmentlearning1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by masterUNG on 4/1/15 AD.
 */
public class TopFragment extends Fragment{

    private TextView txtShow;
    private Button btnButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top, container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);

        //Initial Widget
        txtShow = (TextView) rootView.findViewById(R.id.textView);
        btnButton = (Button) rootView.findViewById(R.id.button);

        controllerButton();

        return rootView;
    }   // onCreateView

    public void clickButton() {
        txtShow.setText("Master UNG");
    }

    private void controllerButton() {
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtShow.setText("You Just Click");
            }
        });
    }

}   // Main Class
