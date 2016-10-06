package kgorski.addresses.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import kgorski.addresses.model.Address;
import kgorski.addresses.service.AddressService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Address controller.
 * 
 * @author kgorski
 *
 */
@Controller
public class AddressController {
    /** Address Service */
    @Autowired
    private AddressService addressService;

    /**
     * Addresses list.
     *
     * @return String
     */
    @RequestMapping("/")
    public String addressesList(Model model) {
        model.addAttribute("addresses", addressService.findAll());

        return "addresses-list";
    }

    /**
     * Address form.
     *
     * @param model the model
     * @return String
     */
    @RequestMapping("/address-form")
    public String addressForm(Model model) {
        model.addAttribute("address", new Address());
        
        return "address-form";
    }

    /**
     * Store address.
     *
     * @param address the address
     */
    @PostMapping("/address-create")
    public String addressCreate(@ModelAttribute Address address) {
        addressService.save(address);

        return "redirect:/";
    }
}
