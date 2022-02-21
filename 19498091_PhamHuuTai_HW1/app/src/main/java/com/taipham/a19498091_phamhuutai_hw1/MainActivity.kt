package com.taipham.a19498091_phamhuutai_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var k ="";
    var dem = 0;
    var gt =""
    var c=""

    var textt20 =""
    var textt10 =""
    var textt5 =""
    var textt1 = ""
    var textt25c= ""
    var textt10c= ""
    var textt5c=""
    var textt1c =""

    var oldPrices: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button0 : Button = findViewById(R.id.button0)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val buttonC : Button = findViewById(R.id.buttonClear)

        val text20 : TextView = findViewById(R.id.twentydollars)
        val text10 : TextView = findViewById(R.id.tendollars)
        val text5 : TextView = findViewById(R.id.fivedollars)
        val text1 : TextView = findViewById(R.id.onedollars)
        val text25c : TextView = findViewById(R.id.twentyfivecent)
        val text10c : TextView = findViewById(R.id.tencent)
        val text5c : TextView = findViewById(R.id.fivecent)
        val text1c : TextView = findViewById(R.id.onecent)

        val gtPrice : TextView = findViewById(R.id.value_price)



        button0.setOnClickListener { 
            k=button0.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }

        button1.setOnClickListener {
            k=button1.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        button2.setOnClickListener {
            k=button2.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        button3.setOnClickListener {
            k=button3.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        button4.setOnClickListener {
            k=button4.text.toString()
            dem++
            gtriPrice(gtPrice)
        }
        button5.setOnClickListener {
            k=button5.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        button6.setOnClickListener {
            k=button6.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        button7.setOnClickListener {
            k=button7.text.toString()
            dem++
            gtriPrice(gtPrice)
        }
        button8.setOnClickListener {
            k=button8.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        button9.setOnClickListener {
            k=button9.text.toString()
            dem++
            gtriPrice(gtPrice)
            sotien()
        }
        buttonC.setOnClickListener {

            gtPrice.text = "0.00"
            k =""
            c=""
            dem=0
            sotien()
        }

//        c = if (
//            gtPrice.text.toString() == "0.00"
//        ) "" else gtPrice.text.toString()

        if (savedInstanceState != null) {

            c = savedInstanceState.getString("Pricecurrent").toString()
            gtPrice.setText(c)
            gt = savedInstanceState.getString("Price").toString();
            gtPrice.setText(gt);

//            oldPrices = savedInstanceState.getStringArrayList("listPrice")!!
//            var t= 0
//            for (i in prices.indices) {
//                prices[i].setText(oldPrices[t])
//                t+=1
//            }
//            var prices = arrayOf(text20, text10,text5, text1, text25c, text5c, text1c)
//
//            for (i in prices.indices) {
//                prices[i].text = oldPrices?.get(i)?: "0"
//            }
            textt20 = savedInstanceState.getString("doitien1").toString()
            textt10 = savedInstanceState.getString("doitien2").toString()
            textt5 = savedInstanceState.getString("doitien3").toString()
            textt1 = savedInstanceState.getString("doitien4").toString()
            textt25c = savedInstanceState.getString("doitien5").toString()
            textt10c = savedInstanceState.getString("doitien6").toString()
            textt5c = savedInstanceState.getString("doitien7").toString()
            textt1c = savedInstanceState.getString("doitien8").toString()

            text20.setText(textt20);
            text10.setText(textt10);
            text5.setText(textt5);
            text1.setText(textt1);
            text25c.setText(textt25c);
            text10c.setText(textt10c);
            text5c.setText(textt5c);
            text1c.setText(textt1c);
//
//            c = savedInstanceState.getString("Pricecurrent").toString()
//            gtPrice.setText(c)
        }
    }


    private fun gtriPrice(textView: TextView) {
//        var text_number: String = textView.text.toString()
//
//        if (dem==1){ // vị trí cuối 1
//            textView.text = "0.0" +((text_number.length-1).toString().replace((text_number.length-1).toString(),k))
//        }
//
//        else if (dem==2){ // vị trí 2 từ cuối đếm lên
//            textView.text = "0." +((text_number.length-2).toString().replace((text_number.length-2).toString(),k))
////            var a=  textView.text
//        }
//        else{
//            textView.text = k.substring(0,text_number.length-2)+"."+k.substring(text_number.length-2)
//        }

//        if (dem==1){
//
//            textView.text = "0.0" +k
//        }
//        else if(dem==2){
//
//            textView.text="0."+k
//        }
//        else {
//            textView.text = k.substring(0,k.length-2)+"."+k.substring(k.length-2)
//
//        }
//        gt = textView.text as String
        c += k

        textView.text = (c.toDouble()/100.0).toString()

        gt = textView.text as String

    }

    fun sotien() {


        val gtPrice : TextView = findViewById(R.id.value_price)
        val text20 : TextView = findViewById(R.id.twentydollars)
        val text10 : TextView = findViewById(R.id.tendollars)
        val text5 : TextView = findViewById(R.id.fivedollars)
        val text1 : TextView = findViewById(R.id.onedollars)
        val text25c : TextView = findViewById(R.id.twentyfivecent)
        val text10c : TextView = findViewById(R.id.tencent)
        val text5c : TextView = findViewById(R.id.fivecent)
        val text1c : TextView = findViewById(R.id.onecent)
        var test = gtPrice.text.split('.')
        var before_dollar = test[0].toInt()
        var after_cent = test[1].toInt()
        //giá trị dollars
        text20.text = "$20: "+ (before_dollar / 20).toString()
        before_dollar = before_dollar % 20
        textt20 = text20.text as String
//        oldPrices.add(text20.text as String)
        text10.text = "$10: "+(before_dollar / 10).toString()
        before_dollar = before_dollar % 10
        textt10 = text10.text as String
//        oldPrices.add(text10.text as String)
        text5.text = "$5: "+(before_dollar / 5).toString()
        before_dollar = before_dollar % 5
        textt5 = text5.text as String
//        oldPrices.add(text5.text as String)
        text1.text = "$1: "+(before_dollar / 1).toString()
//        oldPrices.add(text1.text as String)
        before_dollar = before_dollar % 1
        textt1 = text1.text as String

        // giá trị cent
        text25c.text = "25c: "+(after_cent / 25).toString()
        after_cent = after_cent % 25
        textt25c = text25c.text as String
//        oldPrices.add(text25c.text as String)
        text10c.text = "10c: "+(after_cent / 10).toString()
        after_cent = after_cent % 10
        textt10c = text10c.text as String
//        oldPrices.add(text10c.text as String)
        text5c.text = "5c: "+(after_cent / 5).toString()
        after_cent = after_cent % 5
        textt5c = text5c.text as String
//        oldPrices.add(text5c.text as String)
        text1c.text = "1c: "+(after_cent / 1).toString()
        after_cent = after_cent % 1
        textt1c = text1c.text as String
//        oldPrices.add(text1c.text as String)


//        prices = arrayOf(
//            text20, text10,
//            text5, text1,
//            text25c, text10c,
//            text5c, text1c
//        )
//        var prices = arrayOf(text20, text10,text5, text1, text25c, text5c, text1c)
//        for (i in prices.indices) {
//            prices[i].text = prices[i].text
//        }

    }



    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val gtPrice : TextView = findViewById(R.id.value_price)
        outState.putString("Price",gt)

        outState.putString("Pricecurrent",c)

        outState.putString("doitien1", textt20)
        outState.putString("doitien2", textt10)
        outState.putString("doitien3", textt5)
        outState.putString("doitien4", textt1)
        outState.putString("doitien5", textt25c)
        outState.putString("doitien6", textt10c)
        outState.putString("doitien7", textt5c)
        outState.putString("doitien8", textt1c)
    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//
//    }
}

