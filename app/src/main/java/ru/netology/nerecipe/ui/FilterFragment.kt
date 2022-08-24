package ru.netology.nerecipe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.netology.nerecipe.R
import ru.netology.nerecipe.adapter.FiltersAdapter
import ru.netology.nerecipe.databinding.FilterFragmentBinding
import ru.netology.nerecipe.databinding.FilterFragmentSwitchBinding
import ru.netology.nerecipe.viewModel.RecipeViewModel

class FilterFragment : Fragment() {

    private lateinit var binding: FilterFragmentSwitchBinding
    private val viewModel by activityViewModels<RecipeViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FilterFragmentSwitchBinding.inflate(
        layoutInflater, container, false
    ).also {
        binding = it

        with(binding) {
            switchEuropean.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_EUROPEAN)
            switchAsian.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_ASIAN)
            switchPanAsian.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_PAN_ASIAN)
            switchEastern.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_EASTERN)
            switchAmerican.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_AMERICAN)
            switchRussian.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_RUSSIAN)
            switchMediterranean.isChecked = viewModel.getStateSwitch(KEY_STATE_SWITCH_MEDITERANEAN)
        }

        with(binding) {

            switchEuropean.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_EUROPEAN,
                    switchEuropean.isChecked
                )
                switchesIsChecked(binding)
            }
            switchAsian.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_ASIAN,
                    switchAsian.isChecked
                )
                switchesIsChecked(binding)
            }
            switchPanAsian.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_PAN_ASIAN,
                    switchPanAsian.isChecked
                )
                switchesIsChecked(binding)
            }
            switchEastern.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_EASTERN,
                    switchEastern.isChecked
                )
                switchesIsChecked(binding)
            }
            switchAmerican.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_AMERICAN,
                    switchAmerican.isChecked
                )
                switchesIsChecked(binding)
            }
            switchRussian.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_RUSSIAN,
                    switchRussian.isChecked
                )
                switchesIsChecked(binding)
            }
            switchMediterranean.setOnClickListener {
                viewModel.saveStateSwitch(
                    KEY_STATE_SWITCH_MEDITERANEAN,
                    switchMediterranean.isChecked
                )
                switchesIsChecked(binding)
            }
        }

    }.root

    private fun switchesIsChecked(binding: FilterFragmentSwitchBinding) {
        if (viewModel.getCategoriesCount() <= 1) {
            with(binding) {
                if (switchEuropean.isChecked) switchEuropean.isEnabled = false
                if (switchAsian.isChecked) switchAsian.isEnabled = false
                if (switchPanAsian.isChecked) switchPanAsian.isEnabled = false
                if (switchEastern.isChecked) switchEastern.isEnabled = false
                if (switchAmerican.isChecked) switchAmerican.isEnabled = false
                if (switchRussian.isChecked) switchRussian.isEnabled = false
                if (switchMediterranean.isChecked) switchMediterranean.isEnabled = false
            }
        } else {
            with(binding) {
                if (switchEuropean.isChecked) switchEuropean.isEnabled = true
                if (switchAsian.isChecked) switchAsian.isEnabled = true
                if (switchPanAsian.isChecked) switchPanAsian.isEnabled = true
                if (switchEastern.isChecked) switchEastern.isEnabled = true
                if (switchAmerican.isChecked) switchAmerican.isEnabled = true
                if (switchRussian.isChecked) switchRussian.isEnabled = true
                if (switchMediterranean.isChecked) switchMediterranean.isEnabled = true
            }
        }
    }

    companion object {
        const val KEY_STATE_SWITCH_EUROPEAN = "european"
        const val KEY_STATE_SWITCH_ASIAN = "asian"
        const val KEY_STATE_SWITCH_PAN_ASIAN = "pan_asian"
        const val KEY_STATE_SWITCH_EASTERN = "eastern"
        const val KEY_STATE_SWITCH_AMERICAN = "american"
        const val KEY_STATE_SWITCH_RUSSIAN = "russian"
        const val KEY_STATE_SWITCH_MEDITERANEAN = "mediterranean"
    }
}