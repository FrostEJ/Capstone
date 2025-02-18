package com.example.singlanguage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

//카테고리 - 기타
public class Fragment6 extends Fragment implements View.OnClickListener {

    public Fragment6() {
            // Required empty public constructor
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment6, container, false);
        LinearLayout image_itch = (LinearLayout) view.findViewById(R.id.layout_itch);
        LinearLayout image_presentation = (LinearLayout) view.findViewById(R.id.layout_presentation);
        LinearLayout image_read = (LinearLayout) view.findViewById(R.id.layout_read);
        LinearLayout image_discuss = (LinearLayout) view.findViewById(R.id.layout_discuss);
        LinearLayout image_north = (LinearLayout) view.findViewById(R.id.layout_north);
        LinearLayout image_south = (LinearLayout) view.findViewById(R.id.layout_south);
        LinearLayout image_cold = (LinearLayout) view.findViewById(R.id.layout_cold);
        LinearLayout image_chop = (LinearLayout) view.findViewById(R.id.layout_chop);
        LinearLayout image_date = (LinearLayout) view.findViewById(R.id.layout_date);
        LinearLayout image_hang = (LinearLayout) view.findViewById(R.id.layout_hang);
        LinearLayout image_love = (LinearLayout) view.findViewById(R.id.layout_love);
        LinearLayout image_most = (LinearLayout) view.findViewById(R.id.layout_most);
        LinearLayout image_mountain = (LinearLayout) view.findViewById(R.id.layout_mountain);
        LinearLayout image_relation = (LinearLayout) view.findViewById(R.id.layout_relation);
        LinearLayout image_road = (LinearLayout) view.findViewById(R.id.layout_road);
        LinearLayout image_stand = (LinearLayout) view.findViewById(R.id.layout_stand);
        LinearLayout image_valley = (LinearLayout) view.findViewById(R.id.layout_valley);
        LinearLayout image_errand = (LinearLayout) view.findViewById(R.id.layout_errand);
        LinearLayout image_make = (LinearLayout) view.findViewById(R.id.layout_make);
        LinearLayout image_place = (LinearLayout) view.findViewById(R.id.layout_place);
        LinearLayout image_culture = (LinearLayout) view.findViewById(R.id.layout_culture);
        LinearLayout image_write = (LinearLayout) view.findViewById(R.id.layout_write);
        LinearLayout image_law = (LinearLayout) view.findViewById(R.id.layout_law);
        LinearLayout image_train = (LinearLayout) view.findViewById(R.id.layout_train);
        LinearLayout image_rescue = (LinearLayout) view.findViewById(R.id.layout_rescue);
        LinearLayout image_pingpong = (LinearLayout) view.findViewById(R.id.layout_pingpong);

        image_itch.setOnClickListener(this);
        image_presentation.setOnClickListener(this);
        image_read.setOnClickListener(this);
        image_discuss.setOnClickListener(this);
        image_north.setOnClickListener(this);
        image_south.setOnClickListener(this);
        image_cold.setOnClickListener(this);
        image_chop.setOnClickListener(this);
        image_date.setOnClickListener(this);
        image_hang.setOnClickListener(this);
        image_love.setOnClickListener(this);
        image_most.setOnClickListener(this);
        image_mountain.setOnClickListener(this);
        image_relation.setOnClickListener(this);
        image_road.setOnClickListener(this);
        image_stand.setOnClickListener(this);
        image_valley.setOnClickListener(this);
        image_errand.setOnClickListener(this);
        image_make.setOnClickListener(this);
        image_place.setOnClickListener(this);
        image_culture.setOnClickListener(this);
        image_write.setOnClickListener(this);
        image_law.setOnClickListener(this);
        image_train.setOnClickListener(this);
        image_rescue.setOnClickListener(this);
        image_pingpong.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), CategoryLearning_study_info.class);

        if (v.getId() == R.id.layout_itch)   intent.putExtra("name", "가렵다");
        else if(v.getId() == R.id.layout_presentation)   intent.putExtra("name", "발표");
        else if(v.getId() == R.id.layout_read)   intent.putExtra("name", "읽다");
        else if(v.getId() == R.id.layout_discuss)   intent.putExtra("name", "상의");
        else if(v.getId() == R.id.layout_north)   intent.putExtra("name", "북쪽");
        else if(v.getId() == R.id.layout_south)   intent.putExtra("name", "남쪽");
        else if(v.getId() == R.id.layout_cold)   intent.putExtra("name", "춥다");
        else if(v.getId() == R.id.layout_chop)   intent.putExtra("name", "다지다");
        else if(v.getId() == R.id.layout_date)   intent.putExtra("name", "데이트");
        else if(v.getId() == R.id.layout_hang)   intent.putExtra("name", "걸다");
        else if(v.getId() == R.id.layout_love)   intent.putExtra("name", "사랑");
        else if(v.getId() == R.id.layout_most)   intent.putExtra("name", "가장");
        else if(v.getId() == R.id.layout_mountain)   intent.putExtra("name", "산");
        else if(v.getId() == R.id.layout_relation)   intent.putExtra("name", "관계");
        else if(v.getId() == R.id.layout_road)   intent.putExtra("name", "도로");
        else if(v.getId() == R.id.layout_stand)   intent.putExtra("name", "서다");
        else if(v.getId() == R.id.layout_valley)   intent.putExtra("name", "산골");
        else if(v.getId() == R.id.layout_errand)   intent.putExtra("name", "심부름");
        else if(v.getId() == R.id.layout_make)   intent.putExtra("name", "만들다");
        else if(v.getId() == R.id.layout_place)   intent.putExtra("name", "장소");
        else if(v.getId() == R.id.layout_culture)   intent.putExtra("name", "문화");
        else if(v.getId() == R.id.layout_write)   intent.putExtra("name", "글");
        else if(v.getId() == R.id.layout_law)   intent.putExtra("name", "법");
        else if(v.getId() == R.id.layout_train)   intent.putExtra("name", "단련");
        else if(v.getId() == R.id.layout_rescue)   intent.putExtra("name", "구출");
        else if(v.getId() == R.id.layout_pingpong)   intent.putExtra("name", "탁구");

        startActivity(intent);
    }
}

