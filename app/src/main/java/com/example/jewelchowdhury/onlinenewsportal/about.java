package com.example.jewelchowdhury.onlinenewsportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
       // setContentView( R.layout.activity_about );

        Element element = new Element(  );
        element.setTitle( "Jewel Chowdhury" );
        //element.setTitle( "Department Of Computer Science and Engineering" );
        //element.setTitle( "University of Barishal" );


        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.cutmypic)
                .setDescription( "Jewel Chowdhury \n Department Of Computer Science and Engineering \n University of Barishal" )
                .addItem(new Element(  ).setTitle("Version 1.0.0"))
                .addItem(element)
                .addGroup("Connect with me")
                .addEmail("jewelcse045@gmail.com")
                .addWebsite("https://github.com/jewelcse")
                .addFacebook("Jewelcsebu")
                .addYoutube("UCgwQo2DYpYBRLHnQGkq8UxQ")
                .addGitHub("jewelcse")
                .addInstagram("md_jewel_chowdhury")
                .addItem( createCopyRight() )
                .create();


        setContentView( aboutPage );
    }

    private Element createCopyRight() {
        Element copyright = new Element(  );

        final String copyRightString = String.format( "CopyRight %d by Jewel Chowdhury",Calendar.getInstance().get( Calendar.YEAR ) );
        copyright.setTitle(copyRightString);
        copyright.setIconDrawable( R.drawable.ic_local_library_black_24dp );
        copyright.setGravity( Gravity.CENTER );

        copyright.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( about.this,copyRightString,Toast.LENGTH_LONG ).show();

            }
        } );

        return  copyright;

    }
}
