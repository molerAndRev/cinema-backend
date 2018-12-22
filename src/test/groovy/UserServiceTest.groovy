import com.moler.cinema.service.UserService
import com.moler.cinema.service.UserServiceImpl
import com.moler.cinema.entity.Users
import com.moler.cinema.entity.builder.UsersBuilder
import com.moler.cinema.repository.UserRepository
import com.moler.cinema.requests.UserRegisterRequest
import spock.lang.Specification;

class UserServiceTest extends Specification {



    UserRepository userRepository = Mock()
    UserService userService = new UserServiceImpl(userRepository)

    def "should register user"() {
        given: "a customer with example name values"
        UserRegisterRequest request = new UserRegisterRequest();
        request.firstName = "first";
        request.lastName = "last"
        request.email = "email"
        request.phone = "123-123-111"
        Users sampleUser = new UsersBuilder()
        .setFirstName(request.firstName)
        .setLastName(request.lastName)
        .setEmail(request.email)
        .setPhone(request.phone)
        .build()

        and: "an userRepository which save user"
        def savedUser = userRepository.save(sampleUser)

        when: "userService save user"
        def result = userService.register(request)

        then: "we get both the first and the last name"
        savedUser == result
    }
}
