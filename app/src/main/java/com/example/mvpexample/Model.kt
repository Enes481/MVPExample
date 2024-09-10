package com.example.mvpexample

import java.util.Arrays

class Model : Contract.Model {

    private val arrayList =
        Arrays.asList(
            "Algoritma ve Programlama.",
            "Yapay zeka ve görüntü işleme",
            "Diferansiyel denklemler",
            "Yapay sinir ağları",
            "Matematik"
        )

    override fun getNextCourse(onFinishedListener: Contract.Model.OnFinishedListener?) {
        android.os.Handler().postDelayed({ onFinishedListener!!.onFinished(getRandomString) }, 1200)
    }

    private val getRandomString: String
        private get() {
            val random = java.util.Random()
            val index = random.nextInt(arrayList.size)
            return arrayList[index]
        }

}