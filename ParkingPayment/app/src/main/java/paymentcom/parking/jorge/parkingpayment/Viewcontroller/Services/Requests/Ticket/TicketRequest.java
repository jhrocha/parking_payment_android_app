package paymentcom.parking.jorge.parkingpayment.Viewcontroller.Services.Requests.Ticket;

import java.util.List;

import paymentcom.parking.jorge.parkingpayment.Model.ApiConstants.ApiConstants;
import paymentcom.parking.jorge.parkingpayment.Model.Ticket.TicketResponse;
import paymentcom.parking.jorge.parkingpayment.Model.Utils.StringValidations;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by jorgehsrocha on 12/8/15.
 */
public interface TicketRequest {

    @GET("/api/v1/ticket/all")
    Call<List<TicketResponse>> allTickets();
}