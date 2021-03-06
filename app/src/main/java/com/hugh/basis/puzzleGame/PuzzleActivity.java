package com.hugh.basis.puzzleGame;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.hugh.basis.R;

import java.util.List;

/**
 * Created by chenyw on 2019-11-20.
 */
public class PuzzleActivity extends AppCompatActivity {
    private ImageView[] mGameOintuItems;
    //宽度
    private int mItemWidth;
    //图片
    private Bitmap mBitmap;
    //切图后存储
    private List<ImagePiece> mItemBitmaps;
    private int mColumn = 2;

    private ImageView mIv1;
    private ImageView mIv2;
    private ImageView mIv3;
    private ImageView mIv4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_puzzle);
        setContentView(R.layout.activity_vdhblog);
//        mIv1 = findViewById(R.id.iv_1);
//        mIv2 = findViewById(R.id.iv_2);
//        mIv3 = findViewById(R.id.iv_3);
//        mIv4 = findViewById(R.id.iv_4);
         initBitmap();
//        mIv1.setImageBitmap(mItemBitmaps.get(0).getBitmap());
//        mIv2.setImageBitmap(mItemBitmaps.get(1).getBitmap());
//        mIv3.setImageBitmap(mItemBitmaps.get(2).getBitmap());
//        mIv4.setImageBitmap(mItemBitmaps.get(3).getBitmap());
    }


    private void initBitmap() {
        //判断是否存在这张图片
        if (mBitmap == null) {
            mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.apple);
        }
        //进行裁剪
        mItemBitmaps = ImageSplitterUtil.splitImage(mBitmap, mColumn);

        //裁剪玩后需要进行顺序打乱sort


    }

}
