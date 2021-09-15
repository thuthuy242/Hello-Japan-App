package mpr.a1_1801040217.hellojapan;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHiragana, txtKatakana;
    private ScrollView hiraganaAlphabet, katakanaAlphabet;
    private MediaPlayer mp;
    private Animation leftEnterAnim, rightEnterAnim, topEnterAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Switch between 2 tables of alphabets
    public void onChangeAlphabet(View view) {
        hiraganaAlphabet = findViewById(R.id.hiraganaAlphabet);
        katakanaAlphabet = findViewById(R.id.katakanaAlphabet);
        txtHiragana = findViewById(R.id.txtHiragana);
        txtKatakana = findViewById(R.id.txtKatakana);

        leftEnterAnim = AnimationUtils.loadAnimation(this, R.anim.anim_left_enter);
        rightEnterAnim = AnimationUtils.loadAnimation(this, R.anim.anim_right_enter);
        topEnterAnim = AnimationUtils.loadAnimation(this, R.anim.anim_top_enter);

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.radioBtnHiragana:
                if (checked)
                    //stop sound when change alphabet
                    if(mp.isPlaying()){
                        mp.stop();
                    }
                    katakanaAlphabet.setVisibility(View.GONE);
                    txtKatakana.setVisibility(View.GONE);

                    txtHiragana.setVisibility(view.VISIBLE);
                    txtHiragana.startAnimation(topEnterAnim);

                    hiraganaAlphabet.setVisibility(view.VISIBLE);
                    //always start with the the top of scrollview
                    hiraganaAlphabet.fullScroll(ScrollView.FOCUS_UP);
                    hiraganaAlphabet.startAnimation(leftEnterAnim);

                break;

            case R.id.radioBtnKatakana:
                if (checked)
                    //stop sound when change alphabet
                    if(mp.isPlaying()){
                        mp.stop();
                    }
                    txtHiragana.setVisibility(View.GONE);
                    hiraganaAlphabet.setVisibility(View.GONE);

                    txtKatakana.setVisibility(view.VISIBLE);
                    txtKatakana.startAnimation(topEnterAnim);

                    katakanaAlphabet.setVisibility(view.VISIBLE);
                    katakanaAlphabet.fullScroll(ScrollView.FOCUS_UP);
                    katakanaAlphabet.startAnimation(rightEnterAnim);
                break;
        }
    }

    // play the sound of pronunciation for the selected character
    public void onSoundClick(View view){
        //get tag of character
        switch (view.getTag().toString()) {
            case "a":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.a);
                    mp.start();
                } else if (mp.isPlaying()) { //stop pronouncing when user select a new character
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.a);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.a);
                    mp.start();
                }
                break;
            case "i":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.i);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.i);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.i);
                    mp.start();
                }
                break;
            case "u":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.u);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.u);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.u);
                    mp.start();
                }
                break;

            case "e":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.e);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.e);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.e);
                    mp.start();
                }
                break;

            case "o":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.o);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.o);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.o);
                    mp.start();
                }
                break;
            case "ka":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ka);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ka);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ka);
                    mp.start();
                }
                break;

            case "ki":
                if (mp == null) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mp.start();
            } else if (mp.isPlaying()) {
                mp.reset();
                mp = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mp.start();
            } else {
                mp = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mp.start();
            }
                break;

            case "ku":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ku);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ku);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ku);
                    mp.start();
                }
                break;

            case "ke":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ke);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ke);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ke);
                    mp.start();
                }
                break;

            case "ko":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ko);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ko);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ko);
                    mp.start();
                }
                break;

            case "sa":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.sa);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.sa);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.sa);
                    mp.start();
                }
                break;

            case "shi":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.shi);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.shi);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.shi);
                    mp.start();
                }
                break;

            case "su":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.su);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.su);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.su);
                    mp.start();
                }
                break;

            case "se":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.se);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.se);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.se);
                    mp.start();
                }
                break;

            case "so":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.so);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.so);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.so);
                    mp.start();
                }
                break;

            case "ta":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ta);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ta);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ta);
                    mp.start();
                }
                break;

            case "chi":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.chi);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.chi);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.chi);
                    mp.start();
                }
                break;

            case "tsu":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                    mp.start();
                }
                break;

            case "te":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.te);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.te);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.te);
                    mp.start();
                }
                break;

            case "to":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.to);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.to);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.to);
                    mp.start();
                }
                break;

            case "na":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.na);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.na);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.na);
                    mp.start();
                }
                break;

            case "ni":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ni);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ni);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ni);
                    mp.start();
                }
                break;

            case "nu":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.nu);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.nu);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.nu);
                    mp.start();
                }
                break;

            case "ne":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ne);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ne);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ne);
                    mp.start();
                }
                break;

            case "no":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.no);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.no);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.no);
                    mp.start();
                }
                break;

            case "ha":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ha);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ha);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ha);
                    mp.start();
                }
                break;

            case "hi":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.hi);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.hi);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.hi);
                    mp.start();
                }
                break;

            case "fu":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.fu);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.fu);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.fu);
                    mp.start();
                }
                break;

            case "he":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.he);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.he);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.he);
                    mp.start();
                }
                break;

            case "ho":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ho);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ho);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ho);
                    mp.start();
                }
                break;

            case "ma":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ma);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ma);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ma);
                    mp.start();
                }
                break;

            case "mi":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mi);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mi);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mi);
                    mp.start();
                }
                break;

            case "mu":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mu);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mu);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mu);
                    mp.start();
                }
                break;

            case "me":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.me);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.me);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.me);
                    mp.start();
                }
                break;

            case "mo":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mo);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mo);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.mo);
                    mp.start();
                }
                break;

            case "ya":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ya);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ya);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ya);
                    mp.start();
                }
                break;

            case "yu":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.yu);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.yu);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.yu);
                    mp.start();
                }
                break;

            case "yo":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.yo);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.yo);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.yo);
                    mp.start();
                }
                break;

            case "ra":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ra);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ra);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ra);
                    mp.start();
                }
                break;

            case "ri":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ri);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ri);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ri);
                    mp.start();
                }
                break;

            case "ru":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ru);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ru);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ru);
                    mp.start();
                }
                break;

            case "re":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.re);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.re);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.re);
                    mp.start();
                }
                break;

            case "ro":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ro);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ro);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ro);
                    mp.start();
                }
                break;

            case "wa":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.wa);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.wa);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.wa);
                    mp.start();
                }
                break;

            case "wo":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.wo);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.wo);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.wo);
                    mp.start();
                }
                break;

            case "n":
                if (mp == null) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.n);
                    mp.start();
                } else if (mp.isPlaying()) {
                    mp.reset();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.n);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.n);
                    mp.start();
                }
                break;
        }
    }
}