package appewtc.masterung.fragmentlearning1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity{

    private Fragment objFragment;
    private Button btnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial Fragment
        objFragment = getFragmentManager().findFragmentById(R.id.fragment);
        final TopFragment objTopFragment = (TopFragment) objFragment;
        objTopFragment.clickButton();

        btnActivity = (Button) findViewById(R.id.button2);
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objTopFragment.clickButton();
            }
        });

    }   // onCreate


}   // Main Class
