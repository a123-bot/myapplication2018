package com.example.p031_mokuaihua_viewpager_fragment.demo5.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.p031_mokuaihua_viewpager_fragment.R;
import com.example.p031_mokuaihua_viewpager_fragment.utils.ToastUtil;

public class FragmentContent extends Fragment {

    private String tablayoutId;
    private Context mContext;
    private View vRoot;
    private TextView tv1;

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mContext = getActivity();
//        Bundle arg = getArguments();
        if (getArguments() != null) {
            tablayoutId = getArguments().getString("tablayoutId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (vRoot == null) {
            vRoot = LayoutInflater.from(mContext).inflate(R.layout.activity_demo5_fragment_content, container, false);
        }
        tv1 = vRoot.findViewById(R.id.tv1);

        initData();
        return vRoot;
    }

    /**
     * 第一次进来加载bufen
     */
    private void initData() {
//        doNetWork_toubu();
//        which_page = 1;
//        //categoryId
//        doNetWorkContent2(which_page);
        ToastUtil.showToastCenter("内容" + tablayoutId);
    }


    /**
     * 底部点击bufen
     *
     * @param cateId
     */
    public void getCate(String cateId) {
//        doNetWork_toubu();
//        GAdaptor = new RecycleViewAdapter1(mContext);
//        recyclerView.setAdapter(GAdaptor);
//        which_page = 1;
//        doNetWorkContent2(which_page);
//        isTou_onclick = false;
        ToastUtil.showToastCenter("内容" + cateId);
    }

}
