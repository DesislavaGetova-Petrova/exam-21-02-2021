package exam.exam.web;

import exam.exam.model.binding.AlbumAddBindingModel;
import exam.exam.model.service.AlbumServiceModel;
import exam.exam.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/albums")
public class AlbumController {
    private final AlbumService albumService;
    private final ModelMapper modelMapper;

    public AlbumController(AlbumService albumService, ModelMapper modelMapper) {
        this.albumService = albumService;
        this.modelMapper = modelMapper;
    }
    @GetMapping("/add")
    public String add(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("user") == null) {
            return "redirect:/";
        }
        if(!model.containsAttribute("albumAddBindingModel")){
            model.addAttribute("albumAddBindingModel",new AlbumAddBindingModel());            }
        return "add-album";
    }
    @PostMapping("/add")
    public String addConfirm(@Valid @ModelAttribute("albumAddBindingModel") AlbumAddBindingModel albumAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("albumAddBindingModel", albumAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.albumAddBindingModel",bindingResult);
            return "redirect:add";
        }
        this.albumService.add(this.modelMapper.map(albumAddBindingModel, AlbumServiceModel.class));
        return  "redirect:/";
    }
}
