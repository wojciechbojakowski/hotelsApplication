package wojciech.hotelsapplication.remote.rest.dto.request;

import java.util.List;

public class ReservationsDto {
    private List<HotelsDto> hotels;
    private PersonDto person;

    public ReservationsDto() {
    }

    public ReservationsDto(List<HotelsDto> hotels, PersonDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<HotelsDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
