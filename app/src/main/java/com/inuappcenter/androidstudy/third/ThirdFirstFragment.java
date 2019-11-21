package com.inuappcenter.androidstudy.third;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.inuappcenter.androidstudy.R;
import com.inuappcenter.androidstudy.second.SecondActivity;

public class ThirdFirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third_first, container, false);
        TextView textView = view.findViewById(R.id.tv_fragment1);
        Toast.makeText(getActivity(), "메시지", Toast.LENGTH_SHORT).show();
        return view;
    }
}
