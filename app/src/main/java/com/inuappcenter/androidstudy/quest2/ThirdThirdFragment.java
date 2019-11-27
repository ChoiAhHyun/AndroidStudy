package com.inuappcenter.androidstudy.quest2;

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

public class ThirdThirdFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_third_fragment, container, false);
        TextView textView = view.findViewById(R.id.tv_fragment3);
        Toast.makeText(getActivity(), "메시지", Toast.LENGTH_SHORT).show();
        return view;
    }
}