package com.example.evan.musicsynthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, aButton, asButton, bButton,
            eScaleButton, challenge2Button, challenge3Button, challenge12Button, hFButton;
    private MediaPlayer cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, aNote, asNote, bNote,
            hANote, hBNote, hCsNote, hDsNote, hENote, hAsNote, hFNote, hDNote, hCNote;
    private final int WHOLE_NOTE = 1000;
    private NumberPicker numberPicker1, notePicker;
    private MediaPlayer[] notes, eScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListener();
        createMediaPlayer();
        numberPicker1.setMinValue(0);
        numberPicker1.setMaxValue(10);
        notePicker.setMinValue(0);
        notePicker.setMaxValue(11);
        notePicker.setDisplayedValues(new String[] { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"} );

        notes = new MediaPlayer[]{aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote};
        eScale = new MediaPlayer[]{eNote, fsNote, gsNote, hANote, hBNote, hCsNote, hDsNote, hENote};
    }

    private void createMediaPlayer() {
        aNote= MediaPlayer.create(this, R.raw.scalea);
        asNote= MediaPlayer.create(this, R.raw.scalebb);
        bNote= MediaPlayer.create(this, R.raw.scaleb);
        cNote= MediaPlayer.create(this, R.raw.scalec);
        csNote= MediaPlayer.create(this, R.raw.scalecs);
        dNote= MediaPlayer.create(this, R.raw.scaled);
        dsNote= MediaPlayer.create(this, R.raw.scaleds);
        eNote= MediaPlayer.create(this, R.raw.scalee);
        fNote= MediaPlayer.create(this, R.raw.scalef);
        fsNote= MediaPlayer.create(this, R.raw.scalefs);
        gNote= MediaPlayer.create(this, R.raw.scaleg);
        gsNote= MediaPlayer.create(this, R.raw.scalegs);
        hANote= MediaPlayer.create(this, R.raw.scalehigha);
        hBNote= MediaPlayer.create(this, R.raw.scalehighb);
        hCsNote= MediaPlayer.create(this, R.raw.scalehighcs);
        hDsNote= MediaPlayer.create(this, R.raw.scalehighds);
        hENote= MediaPlayer.create(this, R.raw.scalehighe);
        hAsNote= MediaPlayer.create(this, R.raw.scalehighbb);
        hFNote= MediaPlayer.create(this, R.raw.scalehighf);
        hCNote= MediaPlayer.create(this, R.raw.scalehighc);
        hDNote= MediaPlayer.create(this, R.raw.scalehighc);
    }

    private void setListener() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        eScaleButton.setOnClickListener(this);
        numberPicker1.setOnClickListener(this);
        notePicker.setOnClickListener(this);
        challenge2Button.setOnClickListener(this);
        challenge3Button.setOnClickListener(this);
        challenge12Button.setOnClickListener(this);
        hFButton.setOnClickListener(this);
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        eScaleButton = (Button) findViewById(R.id.button_escale);
        numberPicker1 = (NumberPicker) findViewById(R.id.numberPicker1);
        notePicker = (NumberPicker) findViewById(R.id.notePicker);
        challenge2Button = (Button) findViewById(R.id.challenge_2_button);
        challenge3Button = (Button) findViewById(R.id.challenge_3_button);
        challenge12Button = (Button) findViewById(R.id.challenge_12_button);
        hFButton = (Button) findViewById(R.id.button_hf);
    }


    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_a:
                aNote.seekTo(0); //restarts note at the beginning
                aNote.start();
                delayPlaying(1000);
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_hf:
                hFNote.seekTo(0);
                hFNote.start();
                break;
            case R.id.button_escale:
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                gsNote.seekTo(0);
                gsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hANote.seekTo(0);
                hANote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hBNote.seekTo(0);
                hBNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hCsNote.seekTo(0);
                hCsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hDsNote.seekTo(0);
                hDsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hENote.seekTo(0);
                hENote.start();
                delayPlaying(WHOLE_NOTE / 2);
                break;
            case R.id.challenge_2_button:
                int k = notePicker.getValue();
                for(int i = 0; i < numberPicker1.getValue(); i++) {
                    notes[k].seekTo(0);
                    notes[k].start();
                    delayPlaying(WHOLE_NOTE / 2);
                }
                break;
            case R.id.challenge_3_button:
                for(int i = 0; i < eScale.length; i++) {
                    eScale[i].seekTo(0);
                    eScale[i].start();
                    delayPlaying(WHOLE_NOTE / 2);
                }
                break;
            case R.id.challenge_12_button:
                for(int i = 0; i < 3; i++) {
                    hAsNote.seekTo(0);
                    hAsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hANote.seekTo(0);
                    hANote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                }
                hAsNote.seekTo(0);
                hAsNote.start();
                delayPlaying(WHOLE_NOTE / 5);
                dsNote.seekTo(0);
                dsNote.start();
                delayPlaying(WHOLE_NOTE / 5);
                for(int i = 0; i < 3; i++) {
                    hAsNote.seekTo(0);
                    hAsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    dsNote.seekTo(0);
                    dsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hDsNote.seekTo(0);
                    hDsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    dsNote.seekTo(0);
                    dsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                }
                for(int i = 0; i < 1; i++) {
                    hAsNote.seekTo(0);
                    hAsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hDNote.seekTo(0);
                    hDNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hAsNote.seekTo(0);
                    hAsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hDsNote.seekTo(0);
                    hDsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hAsNote.seekTo(0);
                    hAsNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hFNote.seekTo(0);
                    hFNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                }
                hAsNote.seekTo(0);
                hAsNote.start();
                delayPlaying(WHOLE_NOTE / 5);
                hCNote.seekTo(0);
                hCNote.start();
                delayPlaying(WHOLE_NOTE / 5);
                fNote.seekTo(0);
                fNote.start();
                delayPlaying(WHOLE_NOTE / 5);
                for(int i = 0; i < 3; i++) {
                    hCNote.seekTo(0);
                    hCNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    fNote.seekTo(0);
                    fNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    hFNote.seekTo(0);
                    hFNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                    fNote.seekTo(0);
                    fNote.start();
                    delayPlaying(WHOLE_NOTE / 5);
                }
                break;
            default:
        }
    }
}
