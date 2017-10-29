package drive.api;

import com.google.api.services.drive.Drive;

import java.io.IOException;

import static drive.util.DriveHelper.getDriveService;
import static drive.util.DriveHelper.getFirstTenAndPrint;

public class DriveApi {

    public static void main(String[] args) throws IOException {
        // Build a new authorized API client service.
        Drive service = getDriveService();

        // Print the names and IDs for up to 10 files.
        getFirstTenAndPrint(service);


    }

}