package minhnv.xda.edu.banhangonline.activity.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import minhnv.xda.edu.banhangonline.R;

/**
 * Created by MinhNguyen on 12/18/2017.
 */

public class FragmentPhuKien extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_thong_tin,container,false);
        return view;
    }
}
