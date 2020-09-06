package app.takemoto.ayumin.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //名前ボタンがタップされた時
        button1.setOnClickListener{

            //画像をimageViewに反映する
            profileImage.setImageResource(R.drawable.randy_image)
            //ラベルをTextViewに反映させる
            profileLabelText.text = "関西メンターのあゆみんです！"
        }

        //スポーツのボタンがタップされた時
        button2.setOnClickListener{

            //画像をimageViewに反映する
            profileImage.setImageResource(R.drawable.baseball_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "スポーツ"
            //コメントをTextViewに反映する
            profileCommentText.text = "好きな動物はネコです！"
        }

        //スポーツのボタンがタップされた時
        button3.setOnClickListener{

            //画像をimageViewに反映する
            profileImage.setImageResource(R.drawable.donut_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "好きな食べ物"
            //コメントをTextViewに反映する
            profileCommentText.text = "甘いものが好きです"
        }

        //スポーツのボタンがタップされた時
        button4.setOnClickListener{

            //画像をimageViewに反映する
            profileImage.setImageResource(R.drawable.gadget_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "趣味"
            //コメントをTextViewに反映する
            profileCommentText.text = "趣味はゲームです"
        }
    }
}