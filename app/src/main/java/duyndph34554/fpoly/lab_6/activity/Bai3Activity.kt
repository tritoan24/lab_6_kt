package duyndph34554.fpoly.lab_6.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import duyndph34554.fpoly.lab_6.R
import duyndph34554.fpoly.lab_6.ui.screens.CinemaSeatBookingScreen
import duyndph34554.fpoly.lab_6.ui.screens.createTheaterSeating

class Bai3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaSeatBookingScreen(seats = createTheaterSeating(
                totalRows = 12,
                totalSeatsPerRow = 9,
                aislePositionInRow = 4,
                aislePositionInColumn = 5
            ), totalSeatsPerRow = 9)
        }
    }
}