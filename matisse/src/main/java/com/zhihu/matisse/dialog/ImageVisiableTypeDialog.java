package com.zhihu.matisse.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.zhihu.matisse.R;

/**
 * 图片可见类型弹窗
 * Created by Jaminchanks on 2019/4/4.
 */
public class ImageVisiableTypeDialog extends PopupWindow {

    private Context mContext;

    private TextView mTvAlways;
    private TextView mTvTime1;
    private TextView mTvTimes2;


    public ImageVisiableTypeDialog(Context context) {
        this.mContext = context;

        View rootView = LayoutInflater.from(mContext).inflate(R.layout.dialog_image_visiable_type, null);
        setContentView(rootView);

        mTvTime1 = rootView.findViewById(R.id.tv_times1);
        mTvTimes2 = rootView.findViewById(R.id.tv_times2);


    }

}
